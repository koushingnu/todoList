package todoList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Java入門 ショッピング風処理クラス.
 */
public class TodoList {

	/**
	 * 商品一覧のリストを返却します.
	 * @return	商品一覧のリスト
	 */
	public ArrayList<TodoBean> getItem() {

		ArrayList<TodoBean> beanList = new ArrayList<TodoBean>();
		TodoDao dao = null;
		ResultSet rs = null;

		try {

			// DAOクラスをインスタンス化
			dao = new TodoDao();
			// 現在の商品一覧を検索
			rs  = dao.selectItem();
			// 検索結果を1レコードずつ処理
			while(rs.next()) {

				// 商品一覧を格納するBeanクラスをインスタンス化
				TodoBean bean = new TodoBean();

				// 商品IDを設定
				bean.setWorkId(rs.getInt("work_id"));
				System.out.println(rs.getInt("work_id"));
				// 商品名を設定
				bean.setWorkName(rs.getString("work_name"));
				System.out.println(rs.getString("work_name"));
				// IDを設定
				bean.setId(rs.getInt("id"));
				System.out.println(rs.getInt("id"));
				// 商品数を設定
				bean.setName(rs.getString("name"));
				System.out.println(rs.getString("name"));
				// IDを設定
				bean.setDeadline(rs.getString("deadline"));
				System.out.println(rs.getString("deadline"));
				// 商品数を設定
				bean.setCompletion(rs.getString("completion_time"));
				System.out.println(rs.getString("completion_time"));

				// Beanクラスをリストに追加
				beanList.add(bean);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			// 処理終了時に各接続を解除
			dao.close();
		}

		return beanList;
	}

	/**
	 * 商品IDを基に商品情報を返却します.
	 * @return	商品情報
	 */
	public TodoBean getItem(String itemId) {

		TodoBean bean = new TodoBean();
		TodoDao dao = null;
		ResultSet rs = null;

		try {

			// DAOクラスをインスタンス化
			dao = new TodoDao();
			// 現在の商品一覧を検索
			rs  = dao.selectItem();

			// 検索結果を処理
			while(rs.next()) {

				// 商品IDを設定
				bean.setWorkId(rs.getInt("work_id"));
				// 商品名を設定
				bean.setWorkName(rs.getString("work_name"));
				// 商品価格を設定
				bean.setId(rs.getInt("id"));
				// 商品数を設定
				bean.setName(rs.getString("name"));
				// 商品価格を設定
				bean.setDeadline(rs.getString("deadline"));
				// 商品数を設定
				bean.setCompletion(rs.getString("completion"));

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			// 処理終了時に各接続を解除
			dao.close();
		}

		return bean;
	}

	/**
	 * 購入履歴のリストを返却します.
	 * @return	購入履歴のリスト
	 */
	public ArrayList<HistoryBean> getHistory(String id) {

		ArrayList<HistoryBean> beanList = new ArrayList<HistoryBean>();
		TodoDao dao = null;
		ResultSet rs = null;

		try {

			// DAOクラスをインスタンス化
			dao = new TodoDao();
			// 現在の商品一覧を検索
			rs  = dao.selectHistory(id);

			// 検索結果を1レコードずつ処理
			while(rs.next()) {

				// 商品一覧を格納するBeanクラスをインスタンス化
				HistoryBean bean = new HistoryBean();

				// 商品IDを設定
				bean.setItemId(rs.getString("item_id"));
				// 商品名を設定
				bean.setItemName(rs.getString("item_name"));
				// 商品数を設定
				bean.setQuantity(rs.getInt("quantity"));

				// Beanクラスをリストに追加
				beanList.add(bean);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			// 処理終了時に各接続を解除
			dao.close();
		}

		return beanList;
	}
}