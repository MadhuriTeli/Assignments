package tester;

import static utils.CollectionUtils.populateMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.AccountType;
import com.app.core.BankAccount;

import custom_exception.AccountHandlingException;
import static com.app.core.AccountType.valueOf;
import static utils.AccountValidation.validateBalance;
import static java.time.LocalDate.parse;

public class BankingApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map of sample data
			HashMap<Integer, BankAccount> acctMap = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Create A/C 2. Display All Accounts 3.Get A/C summary"
						+ "4. Funds Transfer 5. Close A/C 6.Search by A/C Type 7. Sort a/cs by acct no100.Exit");

				try {
					switch (sc.nextInt()) {
					case 1: // create a/c : validation rule : no dup a/cs
						System.out.println(
								"Enter a/c details  acctNo,  customerName,  type,  balance,  creationDate(yyyy-MM-dd)");
						int acctNo = sc.nextInt();
						if (acctMap.containsKey(acctNo))
							throw new AccountHandlingException("Dup a/c no!!!!!");
						// new a/c no
						acctMap.put(acctNo, new BankAccount(acctNo, sc.next(), valueOf(sc.next().toUpperCase()),
								validateBalance(sc.nextDouble()), parse(sc.next())));
						System.out.println("A/c created...");
						break;
					case 2:
						System.out.println("All A/c Details");
						// can u attach an iterator / for-each / for to the map ? NO
						// convert Map ---> Collection (keySet / values /entrySet)
						for (BankAccount a : acctMap.values())
							System.out.println(a);

						break;
					case 3: // get a/c summary : i/p acct no
						System.out.println("Enter acct no to get a/c details");
						BankAccount a = acctMap.get(sc.nextInt());// auto boxing (int ---> Integer)
						if (a == null)
							throw new AccountHandlingException("Invalid acct no!!!!!");
						System.out.println("A/C Summary " + a);
						break;

					case 4: // transfer funds i/p : src acct no , dest acct no amount
						System.out.println("Enter src a/c no , dest a/c no amount");
						int srcNo = sc.nextInt();
						int destNo = sc.nextInt();
						double amount = sc.nextDouble();
						// get src acct details from src a/c no (validate if src a/c exists)
						BankAccount src = acctMap.get(srcNo);
						if (src == null)
							throw new AccountHandlingException("Invalid src acct no!!!!!");
						BankAccount dest = acctMap.get(destNo);
						if (dest == null)
							throw new AccountHandlingException("Invalid dest acct no!!!!!");
						// a/cs exists
						src.transferFunds(dest, amount);
						System.out.println("funds transferred...");
						break;
					case 5:
						System.out.println("Enter acct no");
						a = acctMap.remove(sc.nextInt());
						if (a == null)
							throw new AccountHandlingException("Can't close A/C : invalid acct no!!!!!!");
						System.out.println("Closed A/C " + a);
						break;

					case 6:
						System.out.println("Enter a/c type to fetch a/c balance");
						AccountType type = valueOf(sc.next().toUpperCase());
						System.out.println("Printing balance of all " + type + " type of a/cs");
						for (BankAccount a1 : acctMap.values())
							if (a1.getType().equals(type))
								System.out.println(a1.getBalance());
						break;
					case 7:
						//sorted map : TreeMap(Map<? extends K,? extends V> map)
						TreeMap<Integer, BankAccount> sortedMap=new TreeMap<>(acctMap);
						//JVM invokes Integer's compareTo
						System.out.println("Accts sorted as per a/c no ");
						for(BankAccount a1 : sortedMap.values())
							System.out.println(a1);
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// System.out.println(e.getMessage());
				}
				// clear the buffere of a scanner till new line
				sc.nextLine();
			}
		}

	}

}
