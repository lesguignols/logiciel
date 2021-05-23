package projetM1.graphql.offer;

import java.util.ArrayList;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;

import projetM1.graphql.product.Product;
import projetM1.graphql.product.ProductRepository;


public class OfferResolver implements GraphQLResolver<Offer> {
	private final ProductRepository productRepository;

	public OfferResolver(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	public List<Product> products(Offer offer) {
		List<Product> listProduct = new ArrayList<Product>();
		List<Integer> listIdProduct = (List<Integer>) offer.getId_products();
		for(int idProduct : listIdProduct) {
			listProduct.add(productRepository.findById(idProduct));
		}
		return listProduct;
	}
}
