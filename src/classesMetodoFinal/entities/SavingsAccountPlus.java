package classesMetodoFinal.entities;

//se eu usar extends SavigsAccount, tomarei erro, pq a classe SavigsAccount possui o final na sua classe, ou seja não pode ser herdada, não pode ter subclasses
public class SavingsAccountPlus extends SavigsAccount {

    // se o metodo estiver como final, ele não pode ser sobreposto por outras subclasses
//    @Override
//    public void withdraw(double amount) {
//        balance -= 2.0;
//    }
}
