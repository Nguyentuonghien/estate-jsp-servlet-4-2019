<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách tòa nhà</title>
</head>
<body>
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
							chủ</a></li>
					<li>Danh sách sản phẩm</li>
				</ul>
				<!-- /.breadcrumb -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<div class="widget-box table-filter">
							<div class="widget-header">
								<h4 class="widget-title">Tìm kiếm</h4>
								<div class="widget-toolbar">
									<a href="#" data-action="collapse"> <i
										class="ace-icon fa fa-chevron-up"></i>
									</a>
								</div>
							</div>
							<div class="widget-body">
								<div class="widget-main">
									<div class="form-horizontal">
										<div class="form-group">
											<div class="col-sm-6">
												<label><b>Tên Sản phẩm</b></label>
												<div class="fg-line">
													<input type="text" class="form-control input-sm" />
												</div>
											</div>
											<div class="col-sm-6">
												<label><b>Diện tích sàn</b></label>
												<div class="fg-line">
													<input type="number" class="form-control input-sm" />
												</div>
											</div>
										</div>
										<div class="form-group">
											<div class="col-sm-4">
												<label><b>Tên quản lý</b></label>
												<div class="fg-line">
													<input type="text" class="form-control input-sm" />
												</div>
											</div>
											<div class="col-sm-4">
												<label><b>Điện thoại quản lý</b></label>
												<div class="fg-line">
													<input type="text" class="form-control input-sm" />
												</div>
											</div>
											<div class="col-sm-4">
												<label><b>Nhân viên phụ trách</b></label>
												<div class="fg-line">
													<select class="form-control" id="sel1">
														<option>1</option>
														<option>2</option>
														<option>3</option>
														<option>4</option>
													</select>
												</div>
											</div>
										</div>
										<div class="form-group">
											<div class="col-sm-6">
												<label><b>Loại tòa nhà</b></label>
												<div class="fg-line">
												     <label class="checkbox-inline"><input type="checkbox" value="">Option 1</label>
												     <label class="checkbox-inline"><input type="checkbox" value="">Option 2</label>
												     <label class="checkbox-inline"><input type="checkbox" value="">Option 3</label>
												</div>
											</div>
										</div> 
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /.main-content -->
		</div>
	</div>
</body>
</html>













