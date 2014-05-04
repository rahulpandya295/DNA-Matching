

public class RelationFinder {

	Relation Twins, Mother_Father, Brother_Sister, Uncle_Aunt;
	public void Relations(int cost){
		Twins = new Relation();
		Twins.setRelation(95, 99);
		Mother_Father= new Relation();
		Mother_Father.setRelation(80, 95);
		Brother_Sister=new Relation();
		Brother_Sister.setRelation(50, 79);
		Uncle_Aunt= new Relation();
		Uncle_Aunt.setRelation(20, 49);
		System.out.print("\nRelation is : ");
		if(cost==100)
			System.out.print("Same DNA\n");
		else if(cost>=Twins.getStart() && cost <=Twins.getEnd()){
			System.out.print("Twins\n");
		}
		else if(cost>=Mother_Father.getStart() && cost <=Mother_Father.getEnd()){
			System.out.print("Mother or Father\n");
		}
		else if(cost>=Brother_Sister.getStart() && cost <=Brother_Sister.getEnd()){
			System.out.print("Brother or Sister\n");
		}
		else if(cost>=Uncle_Aunt.getStart() && cost <=Uncle_Aunt.getEnd()){
			System.out.print("Uncle or Aunt\n");
		}
	}
}
