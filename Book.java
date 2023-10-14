public class Book extends TangibleAsset{
	String isbn; //TangibleAsset抽象クラスの中には存在していないフィールドなので追加。

	//↓コンストラクタ生成↓
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color); //親クラスと同じ引数は「super(引数)」で継承元の引数を呼び出す
		this.isbn = isbn; //コンストラクタの引数リストに追加されている引数isbnを記述。
	}
	public String getIsbn() {
		return this.isbn; //継承元にisbnの呼び出しがないのでここでゲッターを追加。
	}
}

