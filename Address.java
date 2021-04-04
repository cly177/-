package java作业;

public class Address {

	private String country;
	private String sheng;
	private String city;
	private String jiedao;
	private String youbian;
	
	public Address() {
		this.country="中国";
		this.sheng="湖北";
		this.city="安陆";
		this.jiedao="府城街道";
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
		System.out.println("国家："+this.country);
		System.out.println("省："+this.sheng);
		System.out.println("城市："+this.city);
		System.out.println("街道："+this.jiedao);
		System.out.println("邮编："+this.youbian);
		System.out.println("*************************************************");
	}
}