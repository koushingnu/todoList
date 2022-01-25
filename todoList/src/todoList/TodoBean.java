package todoList;

import java.io.Serializable;

/**
 * Java入門 商品情報クラス.
 */
public class TodoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int workId;		// id
	private String workName;	 // 項目名
	private int id;			// 担当者
	private String name;	// 担当者名
	private String deadline;	// 締め切り
	private String completion;	// 完了日時


	/**
	 * コンストラクタ.<br>
	 * メンバ変数の値を初期化します.
	 */
	public TodoBean() {
		workId   = 0;
		workName = "";
		id = 0;
		name = "";
		deadline = "";
		completion = "";
	}

	/**
	 * 商品IDを返却します.
	 * @return 商品ID
	 */
	public int getWorkId() {
		return workId;
	}

	/**
	 * 商品IDを設定します.
	 * @param itemId 商品ID
	 */
	public void setWorkId(int workId) {
		this.workId = workId;
	}

	/**
	 * 商品名を返却します.
	 * @return 商品名
	 */
	public String getWorkName() {
		return workName;
	}

	/**
	 * 商品名を設定します.
	 * @param itemName	商品名
	 */
	public void setWorkName(String workName) {
		this.workName = workName;
	}

	/**
	 * 商品価格を返却します.
	 * @return	商品価格
	 */
	public int getId() {
		return id;
	}

	/**
	 * 商品価格を設定します.
	 * @param price	商品価格
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 商品数を返却します.
	 * @return	商品数
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品数を設定します.
	 * @param stok	商品数
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 商品数を返却します.
	 * @return	商品数
	 */
	public String getDeadline() {
		return deadline;
	}

	/**
	 * 商品数を設定します.
	 * @param stok	商品数
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	/**
	 * 商品数を返却します.
	 * @return	商品数
	 */
	public String getCompletion() {
		return completion;
	}

	/**
	 * 商品数を設定します.
	 * @param stok	商品数
	 */
	public void setCompletion(String completion) {
		this.completion = completion;
	}

}