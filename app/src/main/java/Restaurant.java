package model;

public class Restaurant {

    public int id;
    public String name;
    public String address;
    public double lat;
    public double lng;

    public Restaurant(){
        id=-1;
        name=null;
        address=null;
        lat=0;
        lng=0;
    }

    public Restaurant(int id1, String name1, String address1, double lat1, double lng1){
        id=id1;
        name=name1;
        address=address1;
        lat=lat1;
        lng=lng1;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public double getLat(){
        return this.lat;
    }
    public double getLng(){
        return this.lng;
    }
}
