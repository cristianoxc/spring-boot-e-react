package com.cristianoxc.dsvendas.dto;

import com.cristianoxc.dsvendas.entities.Seller;

public class SaleSuccessDTO {
	
	private String sallerName;
	private Long visited;
	private Long deals ;
	
	public SaleSuccessDTO() {
	}

	// tem que passar o Saller no contrutor para ser usado no postgree
	// ele nao aceita se passar agrupar se passar somente o sallerName
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		this.sallerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

		
	
}
