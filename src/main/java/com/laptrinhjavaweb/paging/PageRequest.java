package com.laptrinhjavaweb.paging;

public class PageRequest implements Pageble{

	private Integer page;
	private Integer maxPageItem;
	private Sorter sorter;
	
	public PageRequest(Integer page, Integer maxPageItem, Sorter sorter) {
		this.page = page;
		this.maxPageItem = maxPageItem;
		this.sorter = sorter;
	}

	@Override
	public Integer getPage() {
		return null;
	}

	@Override
	public Integer getOffSet() {
		if (page != null && maxPageItem != null) {
			//page chay tu 1 nhung DB chay tu 0:
			return (page - 1) * maxPageItem;
		}
		return null;
	}

	@Override
	public Integer getLimit() {
		return null;
	}

	@Override
	public Sorter getSorter() {
		return sorter;
	}

}
