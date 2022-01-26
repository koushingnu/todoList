package todoList;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 商品一覧ページ処理クラス.
 */
@WebServlet("./TodoServlet")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ.
	 */
    public TodoServlet() {
        super();
    }

    /**
     * POSTメソッドで呼び出された場合の処理.
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		String btn = request.getParameter("submit");


		if("作業登録".equals(btn)) {
			// 商品一覧を取得
			TodoList todolist = new TodoList();
			ArrayList<TodoBean> itemList = todolist.getItem();

			// 商品一覧をリクエストスコープの属性にセット
			request.setAttribute("itemList", itemList);
			System.out.println("Todo servlet register");
			// 商品一覧画面に移動
			RequestDispatcher sc = request.getRequestDispatcher("./todoList_/register.jsp");
			sc.forward(request, response);

		} else {
		// 商品一覧を取得
		TodoList todolist = new TodoList();
		ArrayList<TodoBean> itemList = todolist.getItem();

		// 商品一覧をリクエストスコープの属性にセット
		request.setAttribute("itemList", itemList);

		// 商品一覧画面に移動
		RequestDispatcher rd = request.getRequestDispatcher("./todoList_/itemList.jsp");
		rd.forward(request, response);
		}
	}
}