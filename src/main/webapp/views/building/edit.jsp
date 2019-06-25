<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
							chủ</a></li>
					<li class="active">Thêm sản phẩm</li>
				</ul>
			</div>
			<div class="page-content">
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Tên
						sản phẩm</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Diện
						tích sàn</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Quận</label>
					<div class="col-sm-9">
						<div class="fg-line">
							<select>
								<option value="">Chọn quận</option>
								<option value="QUAN_1">Quận 1</option>
								<option value="QUAN_2">Quận 2</option>
							</select>
						</div>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Phường</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Đường</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Hướng</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Hạng</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Số
						tầng hầm</label>
					<div class="col-sm-9">
						<input type="number" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Diện
						tích thuê</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Giá
						thuê</label>
					<div class="col-sm-9">
						<input type="number" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Tên
						quản lý</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Số
						điện thoại quản lý</label>
					<div class="col-sm-9">
						<input type="text" class="form-control"/>
					</div>
				</div>
				<div class="form-group distance">
					<label class="col-sm-3 control-label no-padding-right">Loại tòa nhà</label>
					<div class="col-sm-9">
						<div class="fg-line">
							<label class="checkbox-inline"><input type="checkbox" value="">Option 1</label>
							<label class="checkbox-inline"><input type="checkbox" value="">Option 2</label> 
							<label class="checkbox-inline"><input type="checkbox" value="">Option 3</label>
						</div>
					</div>
				</div>

				<div class="row text-center btn-addsp">
					<button class="btn btn-light">Hủy bỏ</button>
					<button class="btn btn-success">Thêm sản phẩm</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>




