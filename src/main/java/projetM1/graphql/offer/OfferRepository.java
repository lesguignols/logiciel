package projetM1.graphql.offer;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;




public class OfferRepository {

	private final MongoCollection<Document> offers;

	public OfferRepository(MongoCollection<Document> offers) {
		
		this.offers = offers;
	}
	
	public Offer findById(int id) {
		Document doc = offers.find(eq("id_offer",id)).first();
		return offers(doc);
	}
	
	public List<Offer> getAllOffer(){
		List<Offer> allOffer = new ArrayList<>();
		for(Document doc : offers.find()) {
			if(doc.getInteger("id_offer") != null) {
				allOffer.add(offers(doc));
			}	
		}
		return allOffer;
	}
	
	public void saveOffer(Offer offer) {
		Document doc = new Document();
		doc.append("id_offer", offer.getId_offer());
		doc.append("name", offer.getName());
        doc.append("active", offer.isActive());
        doc.append("price", offer.getPrice());
        doc.append("products", offer.getId_products());
        offers.insertOne(doc);
	}
	
	@SuppressWarnings("unchecked")
	private Offer offers(Document doc) {
        return new Offer(doc.getInteger("id_offer"),
        				 doc.getString("name"),
        				 doc.getBoolean("active"),
        				 doc.getDouble("price"),
        				 (List<Integer>) doc.get("products"));
    }
}
