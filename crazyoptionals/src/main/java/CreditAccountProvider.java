import java.util.Optional;

@FunctionalInterface
public interface CreditAccountProvider {
    Optional<CreditAccount> getAccount();
}