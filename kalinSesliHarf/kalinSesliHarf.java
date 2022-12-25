public class kalinSesliHarf {
    public static void main(String[] args) {
        char harf = 'e';

        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println(harf + " kalın seslidir.");
                break;
            default:
                System.out.println(harf + " ince seslidir.");
        }
    }
}