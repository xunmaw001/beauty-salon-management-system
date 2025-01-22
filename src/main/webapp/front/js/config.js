
var projectName = '美容院管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '美容套餐',
	url: './pages/meirongtaocan/list.html'
}, 
{
	name: '美容产品',
	url: './pages/meirongchanpin/list.html'
}, 

{
	name: '美容资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmje091/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","添加员工工资"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"套餐类型","menuJump":"列表","tableName":"taocanleixing"}],"menu":"套餐类型管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论","美容预约"],"menu":"美容套餐","menuJump":"列表","tableName":"meirongtaocan"}],"menu":"美容套餐管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除"],"menu":"美容预约","menuJump":"列表","tableName":"meirongyuyue"}],"menu":"美容预约管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"产品类型","menuJump":"列表","tableName":"chanpinleixing"}],"menu":"产品类型管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"美容产品","menuJump":"列表","tableName":"meirongchanpin"}],"menu":"美容产品管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","支付","报表"],"menu":"员工工资","menuJump":"列表","tableName":"yuangonggongzi"}],"menu":"员工工资管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"生日提醒","menuJump":"列表","tableName":"shengritixing"}],"menu":"生日提醒管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"营业记录","menuJump":"列表","tableName":"yingyejilu"}],"menu":"营业记录管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"美容资讯","tableName":"news"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","物流","月销量","年销量","月销额","年销额"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-pic","buttons":["查看","物流"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","发货","物流"],"menu":"已支付订单","tableName":"orders/已支付"},{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","物流"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","查看评论","美容预约"],"menu":"美容套餐列表","menuJump":"列表","tableName":"meirongtaocan"}],"menu":"美容套餐模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论"],"menu":"美容产品列表","menuJump":"列表","tableName":"meirongchanpin"}],"menu":"美容产品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","删除"],"menu":"美容预约","menuJump":"列表","tableName":"meirongyuyue"}],"menu":"美容预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","删除"],"menu":"生日提醒","menuJump":"列表","tableName":"shengritixing"}],"menu":"生日提醒管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","查看评论","美容预约"],"menu":"美容套餐列表","menuJump":"列表","tableName":"meirongtaocan"}],"menu":"美容套餐模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论"],"menu":"美容产品列表","menuJump":"列表","tableName":"meirongchanpin"}],"menu":"美容产品模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"美容套餐","menuJump":"列表","tableName":"meirongtaocan"}],"menu":"美容套餐管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"美容预约","menuJump":"列表","tableName":"meirongyuyue"}],"menu":"美容预约管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"产品类型","menuJump":"列表","tableName":"chanpinleixing"}],"menu":"产品类型管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"美容产品","menuJump":"列表","tableName":"meirongchanpin"}],"menu":"美容产品管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"员工工资","menuJump":"列表","tableName":"yuangonggongzi"}],"menu":"员工工资管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"生日提醒","menuJump":"列表","tableName":"shengritixing"}],"menu":"生日提醒管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","查看评论","美容预约"],"menu":"美容套餐列表","menuJump":"列表","tableName":"meirongtaocan"}],"menu":"美容套餐模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论"],"menu":"美容产品列表","menuJump":"列表","tableName":"meirongchanpin"}],"menu":"美容产品模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
