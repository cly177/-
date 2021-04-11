package 银行系统;

public class Main extends Function{
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		boolean flag = true;
		int choice = 0;
		while (flag){
			firstMenu();
			choice = scanner.nextInt();
			switch (choice){
			case 1:
				Create(customer);
				break;
			case 2:
				save(customer);
				break;
			case 3:
				withDraw(customer);
				break;
			case 4:
				consume(customer);
				break;
			case 5:
				repay(customer);
				break;
			case 6:
				settle(customer);
				break;
			case 7:
				requireBalance(customer);
				break;
			case 8:
				flag = false;
				break;
			default:
				System.out.println("请输入0-8序号");
				break;
			}
		}
		System.out.println("bye");
	}
}