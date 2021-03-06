package cn.teaey.lostrpc.client;


import cn.teaey.lostrpc.Dispatcher;

import java.net.InetSocketAddress;

/**
 * @author xiaofei.wxf on 14-2-13.
 */
public interface Client<ReqType, RespType, Channel, T extends Client> {

    T run();

    T shutdown();

    T connect(InetSocketAddress address);

    T showdownNow();

    Object ask(ReqType p);

    T dispatcher(Dispatcher dispatcher);

}
