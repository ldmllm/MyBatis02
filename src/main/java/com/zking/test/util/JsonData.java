package com.zking.test.util;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务器返回给客户端的JSON格式的数据
 *
 */
public class JsonData extends HashMap<String, Object> implements Serializable {

	private static final long serialVersionUID = -8855960778711040221L;

	private static final String CODE_KEY = "code";// 操作代码 0 成功 非0 失败
	private static final String MESSAGE_KEY = "message";// 操作消息
	private static final String RESULT_KEY = "result";// 结果集
	private static final String PAGE_KEY = "page";// 页码
	private static final String ROWS_KEY = "rows";// 每页行数/页大小
	private static final String TOTAL_KEY = "total";// 总记录数
	private static final String TS_KEY = "ts";// 时间戳

	public String writeJson(Object object) {
		try {
			// Java对象=>json字符串
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(object);

			// 向客户端输出json字符串
			HttpServletResponse response = ServletActionContext.getResponse();
			// 如果json打印时出现乱码，设置响应的字符集和内容类型即可
			response.setCharacterEncoding("utf-8"); // 设置编码格式即可
			response.setContentType("application/json;charset=utf-8"); // 设置内
			PrintWriter out = response.getWriter();
			out.println(json);
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public JsonData() {
		super();
		this.put(CODE_KEY, 0);// 默认操作成功
		this.put(TS_KEY, System.currentTimeMillis());
	}

	public void setCode(Integer code) {
		this.put(CODE_KEY, code);
	}

	public void setMessage(String message) {
		this.put(MESSAGE_KEY, message);
	}

	public void setResult(Object result) {
		this.put(RESULT_KEY, result);
	}

	public void setPage(Integer page) {
		this.put(PAGE_KEY, page);
	}

	public void setRows(Integer rows) {
		this.put(ROWS_KEY, rows);
	}

	public void setPageBean(PageBean pageBean) {
		this.setPage(pageBean.getPage());
		this.setRows(pageBean.getRows());
		this.setTotal(pageBean.getTotal());
	}

	public void setTotal(Integer total) {
		this.put(TOTAL_KEY, total);
	}

}
