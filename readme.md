结构说明  
napose-dilevery 

系统由于历史原因,整个结构混乱,现在迁移至订单部门对其中业务做梳理重构;

distribution项目规划如下:

独立服务:
1-distribution-miracle-server :  对外提供业务查询服务,主要是接口
2-distribution-core-chain-server: 配送服务主流程,接入订单物流处理主链条

核心业务组件: 
distribution-core : 处理业务,操作dao和proxy工具

底层功能组件:
1-distribution-dao : 封装db操作
2-distibution-proxy : 封装依赖接口服务  外部依赖接口\消息依赖

测试服务页面:
 
1-distribution-webservice :  本地测试web服务,测试请求页面 