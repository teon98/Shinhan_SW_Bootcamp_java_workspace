package exam;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

public class Prob4 {

	public static void main(String[] args) {
		Product[] prodList = {
				new Product("NT450R5E-K24S",500000,"삼성전자"),
				new Product("15UD340-LX2CK",400000,"LG전자"),
				new Product("G2-K3T32AV",600000,"HP") };
		HashSet<Product> product_hs = makeHashSet(prodList, 500000);
		
		makeFile(product_hs);
		readFile();
		
	}

	
	private static HashSet<Product> makeHashSet(Product[] prodList, int price) {
		//Product 배열에서 특정 금액 이상의 상품만 선택하여 HashSet에 저장 후 리턴
		
		HashSet<Product> select = new HashSet<Product>(); 
		
		for(Product product:prodList) {
			if(product.getPrice() >= price) {
				select.add(product);
			}
		}
		
		return select;
	}


	private static void makeFile(HashSet<Product> resultList){
		//구현하시오.
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator<Product> iterator = resultList.iterator();
		
		while(iterator.hasNext()) {
			Product p = iterator.next();
			//System.out.println(p); //주석처리하기
			
			try {
				oos.writeObject(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void readFile()  {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//시간남으면 고치기
//			Product p1 = (Product)ois.readObject();
//			Product p2 = (Product)ois.readObject();
//			
//			System.out.println(p1);
//			System.out.println(p2);
			Product row;
			while((row = (Product) ois.readObject()) != null) {
				System.out.println(row);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}


class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String model_name;
	private int price;
	private String company;
	
	
	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}


	public String getModel_name() {
		return model_name;
	}


	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	

}