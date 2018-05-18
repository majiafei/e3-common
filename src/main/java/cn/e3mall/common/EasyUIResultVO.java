package cn.e3mall.common;

import java.io.Serializable;

public class EasyUIResultVO<T> implements Serializable{
	
	private static final long serialVersionUID = -5104609243707378326L;

	/**
	 * 数据的总数
	 */
	private long total;
	
	/**
	 * 返回的数据
	 */
	private T rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public T getRows() {
		return rows;
	}

	public void setRows(T rows) {
		this.rows = rows;
	}
	
}
