import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shengritixing from '@/views/modules/shengritixing/list'
    import news from '@/views/modules/news/list'
    import yuangong from '@/views/modules/yuangong/list'
    import yuangonggongzi from '@/views/modules/yuangonggongzi/list'
    import taocanleixing from '@/views/modules/taocanleixing/list'
    import meirongchanpin from '@/views/modules/meirongchanpin/list'
    import discussmeirongtaocan from '@/views/modules/discussmeirongtaocan/list'
    import users from '@/views/modules/users/list'
    import meirongyuyue from '@/views/modules/meirongyuyue/list'
    import discussmeirongchanpin from '@/views/modules/discussmeirongchanpin/list'
    import chanpinleixing from '@/views/modules/chanpinleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import meirongtaocan from '@/views/modules/meirongtaocan/list'
    import orders from '@/views/modules/orders/list'
    import yingyejilu from '@/views/modules/yingyejilu/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shengritixing',
        name: '生日提醒',
        component: shengritixing
      }
      ,{
	path: '/news',
        name: '美容资讯',
        component: news
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/yuangonggongzi',
        name: '员工工资',
        component: yuangonggongzi
      }
      ,{
	path: '/taocanleixing',
        name: '套餐类型',
        component: taocanleixing
      }
      ,{
	path: '/meirongchanpin',
        name: '美容产品',
        component: meirongchanpin
      }
      ,{
	path: '/discussmeirongtaocan',
        name: '美容套餐评论',
        component: discussmeirongtaocan
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/meirongyuyue',
        name: '美容预约',
        component: meirongyuyue
      }
      ,{
	path: '/discussmeirongchanpin',
        name: '美容产品评论',
        component: discussmeirongchanpin
      }
      ,{
	path: '/chanpinleixing',
        name: '产品类型',
        component: chanpinleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/meirongtaocan',
        name: '美容套餐',
        component: meirongtaocan
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/yingyejilu',
        name: '营业记录',
        component: yingyejilu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
