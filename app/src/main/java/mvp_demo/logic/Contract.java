package mvp_demo.logic;

/**
 * Created by Administrator on 2018/5/29.
 */

public class Contract {

    public interface MvpView {
        void requestSuccess();

        void requestFailure();
    }

    public interface Presenter <T extends Contract.MvpView> {
        void request(String id);
    }
}
