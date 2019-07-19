public class KlasaString {

    private String name = "Krzysztof";
    private String aName = new String();

    void setaName(){
        System.out.println(aName.length());
        System.out.println(aName==null);
        this.aName = "Krzysztof";
        firstTest();
    }

    void firstTest(){
        System.out.println(name.equals(aName));
    }

    public static void main(String[] args){
        KlasaString aklasaString = new KlasaString();
        aklasaString.setaName();
    }
}
