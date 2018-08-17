//控制层
app.controller('projectController' ,function($scope,$controller,projectService) {

    $controller('baseController', {$scope: $scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function(){
        projectService.findAll().success(
            function(response){
                $scope.list=response;
            }
        );
    }
    
    // 分页查询品牌列表
	$scope.findPage = function(page,size){
		projectService.findPage().success(
			function(response){
				$scope.list = response.rows;// 当前页的数据
				$scope.paginationConf.totalItems = response.total;// 更新总记录数
			}
	)};

    // 修改状态
    $scope.updateStatus=function(proId, status){
        projectService.updateStatus(proId, status).success(
            function(response){
                if(response.success){
                    $scope.reloadList();//刷新列表
                }else{
                    alert(response.message);
                }
            }
        );
    }

    //保存
    $scope.save=function(){
        var serviceObject;//服务层对象
        if($scope.entity.proId!=null){//如果有ID
            serviceObject=projectService.updateStatus( $scope.entity ); //修改
        }else{
            serviceObject=projectService.add( $scope.entity  );//增加
        }
        serviceObject.success(
            function(response){
                if(response.success){
                    //重新查询
                    $scope.reloadList();//重新加载
                }else{
                    alert(response.message);
                }
            }
        );
    }

    //查询实体
    $scope.findOne=function(proId){
        projectService.findOne(proId).success(
            function(response){
                $scope.entity= response;
            }
        );
    }

    $scope.status=["","正常","暂停","停止"];
	
});