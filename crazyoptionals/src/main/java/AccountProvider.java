import java.util.Optional;

@FunctionalInterface
public interface AccountProvider {
    Optional<Account> getAccount();
}
