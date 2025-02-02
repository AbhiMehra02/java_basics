class Laptop
{
    String model;
    int price;


    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}


class ObjectClass {
    public static void main(String[] args) {
        Laptop obj =new Laptop();
        obj.model="lenovo Yoga";
        obj.price=1000;

        // before toString method it will give classname + "@" + hashCode()
        // after toString method it will string type as per USer requirement 
        // System.out.println(obj);
        System.out.println(obj.toString());

        // Laptop obj2 =new Laptop();
        // obj2.model="lenovo Yoga1";
        // obj2.price=1000;
        
        // boolean result = obj.equals(obj2) ;
        // System.out.println(result);

    }    
}
