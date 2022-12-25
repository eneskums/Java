public class Main {
    public static void main(String[] args) {

//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.log("Log Mesajı");
//        System.out.println("------------*******-----------");
//
//        BaseLogger[] baseLogger = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//        for (BaseLogger logger : baseLogger) {
//            logger.log("Log Mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}