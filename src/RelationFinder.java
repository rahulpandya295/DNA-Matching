

public class RelationFinder {

	Relation Mother_Father, Brother_Sister, Uncle_Aunt;
	public void Relations(int cost){
		Mother_Father= new Relation();
		Mother_Father.setRelation(10, 15);
		Brother_Sister=new Relation();
		Brother_Sister.setRelation(6, 9);
		Uncle_Aunt= new Relation();
		Uncle_Aunt.setRelation(2, 5);
		System.out.print("\nRelation is : ");
		if(cost>=Mother_Father.getStart() && cost <=Mother_Father.getEnd()){
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
