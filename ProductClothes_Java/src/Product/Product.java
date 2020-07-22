package Product;

abstract public class Product {
		public String Productname;
		public String Type;
		private String Size;
		private String Color;
		private int Price;
		public Product() {
		}
		public Product(String Productname,String Type,String Size,String Color,int Price,boolean Withpocket){
			this.Productname = Productname;
			this.Type = Type;
			this.Size = Size;
			this.Color = Color;
			this.Price = Price;
		}
		public String newProductname (String Productname) {
			return Productname;
		}
		public String newType(String Type) {
			return Type;
		}

		
		public String getSize() {
			return Size;
		}
		public void setSize(String size) {
			Size = size;
		}
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}

			
}
