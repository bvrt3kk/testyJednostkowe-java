public class Szyfr {
    public static String szyfrujCezarem(String slowoDoZaszyfrowania, int klucz){
        klucz = klucz%26;
        String zaszyfrowaneSlowo = "";
        for (int i = 0; i < slowoDoZaszyfrowania.length(); i++) {
            char literka = slowoDoZaszyfrowania.charAt(i);
            if(literka == ' '){
                zaszyfrowaneSlowo = zaszyfrowaneSlowo + literka;
            }else{
                int kod = (int)literka + klucz;
                if(kod > (int)'z'){
                    kod = kod - 26;
                }
                zaszyfrowaneSlowo = zaszyfrowaneSlowo + (char)kod;
            }
        }

        return zaszyfrowaneSlowo;
    }
}
