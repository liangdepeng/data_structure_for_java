package cn.design.观察者模式;

import com.cool.ldp.utils.SystemOutputUtils;

public class Shop1 implements Observer {

    public Shop1() {
    }

    @Override
    public void update(int newData) {
        SystemOutputUtils.println("Shop111 更新数据" + newData);
    }
}
