const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmje091/",
            name: "ssmje091",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmje091/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "美容院管理系统"
        } 
    }
}
export default base
