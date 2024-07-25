class Solution {
    public int solution(int price) {
        double discount = 0;
        if(price>=500000){
            discount = (price*0.2);
            price -= discount;
        }
        else if(price >=300000){
            discount = (price *0.1);
            price -= discount;
        }
        else if(price >=100000){
            discount = (price *0.05);
            price -= discount;
        }
        else{
            return price;
        }
        return price;
    }
}