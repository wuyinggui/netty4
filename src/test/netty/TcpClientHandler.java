package test.netty;

import org.apache.log4j.Logger;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TcpClientHandler extends SimpleChannelInboundHandler<Object> {

	private static final Logger logger = Logger.getLogger(TcpClientHandler.class);
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		//messageReceived����,���ƺܱ�Ť������һ���ڲ�����.
		logger.info("client���յ����������ص���Ϣ:"+msg);
		
	}

}
