package java��ҵ;

public class Address {

	private String country;
	private String sheng;
	private String city;
	private String jiedao;
	private String youbian;
	
	public Address() {
		this.country="�й�";
		this.sheng="����";
		this.city="��½";
		this.jiedao="���ǽֵ�";
		this.youbian= "432600";
	}
	public Address(String country, String sheng,String city,String jiedao,String youbian) {
		this.country=country;
		this.sheng=sheng;
		this.city=city;
		this.jiedao=jiedao;
		this.youbian= youbian;
	}
	public void displayAddress() {
		System.out.println("���ң�"+this.country);
		System.out.println("ʡ��"+this.sheng);
		System.out.println("���У�"+this.city);
		System.out.println("�ֵ���"+this.jiedao);
		System.out.println("�ʱࣺ"+this.youbian);
		System.out.println("*************************************************");
	}
}