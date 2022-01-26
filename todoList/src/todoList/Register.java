package todoList;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 商品購入ページ処理クラス.
 */
@WebServlet("/Register")
public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

    /**
     * コンストラクタ.
     */
    public Register() {
        super();
    }

	/**
	 * GETメソッドで呼び出された場合の処理
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// GETメソッドのパラメータ名を取得
		Enumeration<String> names = request.getParameterNames();

		String name  = "";		// 現在のパラメータ名
		String workId= "";		// 商品ID
		String deadline= "";	// 期限

		// 購入ボタンがクリックされた場所を特定
		// 今回のサンプルプログラムの場合、クリックされた購入ボタンの値（value）と、リストボックスの値が取得できる
		// 購入ボタンをクリックした後のURLにパラメータが記載されています
		while(names.hasMoreElements()) {

			// 渡ってきたパラメータを順番に処理
			// パラメータ名を取得
			name = names.nextElement();

			// 購入ボタンがクリックされている場合は「購入」のパラメータが取得できる
			if("登録".equals(request.getParameter(name))) {

				// 購入ボタンに付属している値（value）が商品IDになる
				workId = name;
			}
		}

		// ドロップダウンリストから購入数を取得
		quantity = request.getParameter(itemId + "list");

		// 商品情報を取得
		Shopping shopping = new Shopping();
		ItemBean bean = shopping.getItem(itemId);

		// 商品一覧をリクエストスコープの属性にセット
		request.setAttribute("item", bean);
		request.setAttribute("quantity", quantity);

		// 購入確認画面に移動
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-sample13_14/confirm.jsp");
		rd.forward(request, response);
	}
}


