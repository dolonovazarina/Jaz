public enum Jaz {
     Mart(" 8-Mart"),
     April( " 12-April" ),
    May( " 9-May" );
     private String soz;

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }


    Jaz(String soz) {
        this.soz = soz;

    }

    @Override
    public String toString() {
        return "Jaz{" +
                "soz='" + soz + '\'' +
                ", san=" +
                '}';
    }
}


