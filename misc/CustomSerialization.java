import java.io.*;

class Account implements Serializable {
    String username = "pravin";
    transient String pwd = "jain";

    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        String epwd = "123" + pwd;
        os.writeObject(epwd);  // Use epwd instead of pwd
    }

    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String epwd = (String) is.readObject();  // Read the encrypted password
        pwd = epwd.substring(3);  // Set the decrypted password back to the transient field
    }
}

public class CustomSerialization {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        FileOutputStream fos = new FileOutputStream("demo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        FileInputStream fis = new FileInputStream("demo.ser");  // Specify the file name
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a = (Account) ois.readObject();
        System.out.println(a.username + a.pwd);
    }
}

