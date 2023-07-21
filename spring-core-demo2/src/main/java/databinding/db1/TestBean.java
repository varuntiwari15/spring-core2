package databinding.db1;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "count=" + count +
                '}';
    }
}
