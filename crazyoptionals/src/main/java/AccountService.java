@FunctionalInterface
public interface AccountService {
    void processAccount(Account account);

    default void processWithNoAccount(){
        /* No operation */
    }
}
