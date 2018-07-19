package io.xdag.xdagwallet.fragment;

import io.xdag.common.base.RefreshFragment;
import io.xdag.xdagwallet.MainActivity;
import io.xdag.xdagwallet.wrapper.XdagHandlerWrapper;
import java.util.Objects;

/**
 * created by lxm on 2018/7/18.
 *
 * link {@link MainActivity} and {@link HomeFragment}、{@link SendFragment}、
 * {@link ReceiveFragment}、{@link SettingFragment}
 */
public abstract class BaseMainFragment extends RefreshFragment {

    public MainActivity getMainActivity() {
        if (mContext instanceof MainActivity) {
            return (MainActivity) mContext;
        } else {
            throw new RuntimeException("BaseMainFragment must attach to MainActivity");
        }
    }


    public XdagHandlerWrapper getXdagHandler() {
        return Objects.requireNonNull(getMainActivity()).getXdagHandler();
    }


    /**
     * if is {@link HomeFragment} enabled refresh
     */
    @Override protected boolean isRefresh() {
        return this instanceof HomeFragment;
    }
}
