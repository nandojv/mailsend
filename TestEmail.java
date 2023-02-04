package mailsend;

public class TestEmail {

public static void main(String[] args) {

mail  email = new mail(

"inserire email",

"pswrd",

"smtp.gmail.com",

"mail",

"mail",

"OGGETTO: Invio automatico email da Java"


);

email.inviaEmail();

}

}