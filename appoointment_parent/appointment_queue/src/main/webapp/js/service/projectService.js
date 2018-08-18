//服务层
app.service('projectService',function($http) {

    //读取列表数据绑定到表单中
    this.findAll = function () {
        return $http.get("../project/getProjectList.do");
    }
    
    //分页 
	this.findPage=function(page,rows){
		return $http.get('../project/findpage.do?page='+page+'&rows='+rows);
	}

    //增加
    this.add=function(entity){
        return  $http.post('../project/add.do',entity );
    }

    // 修改状态
    this.updateStatus=function(proId,status){
        return $http.get("../project/updateStatus.do?proId="+proId+"&status="+status);
    }
    
    // 设置批数上限
    this.updateAllGroup=function(proId,status){
        return $http.get("../project/updateAllGroup.do?proId="+proId+"&allGroup="+allGroup);
    }

    //查询实体
    this.findOne=function(proId){
        return $http.get('../project/findOne.do?proId='+proId);
    }

});