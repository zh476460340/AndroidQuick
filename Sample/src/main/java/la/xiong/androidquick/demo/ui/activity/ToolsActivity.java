package la.xiong.androidquick.demo.ui.activity;

import android.view.View;

import butterknife.OnClick;
import la.xiong.androidquick.demo.R;
import la.xiong.androidquick.demo.base.BaseActivity;
import la.xiong.androidquick.demo.ui.fragment.JsonFragment;
import la.xiong.androidquick.demo.ui.fragment.RxjavaFragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class ToolsActivity extends BaseActivity {
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_tools;
    }

    @Override
    protected void initViewsAndEvents() {
        getToolbar().setTitle(getString(R.string.app_name));
        getToolbar().setTitleTextColor(getResources().getColor(R.color.white));
    }

    @OnClick({R.id.btn_tools_json, R.id.btn_tools_rxjava})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_tools_json:
                readyGo(JsonFragment.class);
                break;
            case R.id.btn_tools_rxjava:
                readyGo(RxjavaFragment.class);
                break;
        }
    }

    @Override
    protected boolean isLoadDefaultTitleBar() {
        return true;
    }
}
