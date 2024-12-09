import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.nikolaJ80.Accounts.CreditAccount;
import ru.netology.nikolaJ80.Accounts.SimpleAccount;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class Test {
    SimpleAccount debit;

    @BeforeEach
    public void setUp() {
        debit = new SimpleAccount();
    }

    @org.junit.jupiter.api.Test
    public void testSimpleAccountAdd() {
        //given
        int[] addSum = {500_000, 200_000, 100_000};

        //when
        for (int i : addSum) {
            boolean result = debit.add(i);
            System.out.println("AddSum " + i);
            Assertions.assertTrue(result);
        }

        // then:

    }

    @org.junit.jupiter.api.Test
    public void testSimpleAccountPay() {
        //given
        int[] paySumm = {50_000, 300_000, 150_000};
        //when
        for (int i : paySumm) {
            boolean result = debit.pay(i);
            System.out.println("PaySum " + i);
            Assertions.assertFalse(result);
        }
    }

    @org.junit.jupiter.api.Test
    public void testCreditAccountPay() {
        CreditAccount credit = new CreditAccount(-500_000);
        int[] paySumm = {50_000, 300_000, 250_000};
        boolean[] expected = {true, true, false};

        for (int i = 0; i < paySumm.length; i++) {
            boolean result = credit.pay(paySumm[i]);
            System.out.println(result);
            assertThat(result, equalTo(expected[i]));
        }
    }

}
