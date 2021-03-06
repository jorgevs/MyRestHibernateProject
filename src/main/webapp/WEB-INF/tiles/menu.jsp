<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="navbar-default navbar-static-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/spDashboard"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/spFlotCharts"><fmt:message key="menu.flotCharts"/></a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/spMorrisCharts">Morris.js Charts</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/spTables"><i class="fa fa-table fa-fw"></i> Tables</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/spForms"><i class="fa fa-edit fa-fw"></i> Forms</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/spPanelsWells">Panels and Wells</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/spButtons">Buttons</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/spNotifications">Notifications</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/spTypography">Typography</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/spGrid">Grid</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Third Level <span class="fa arrow"></span></a>
                        <ul class="nav nav-third-level">
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                        </ul>
                        <!-- /.nav-third-level -->
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/spBlank">Blank Page</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/spLogin">Login Page</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
			<li>
                <a href="#"><i class="fa fa-tags fa-fw"></i> Offers<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/offers/showCreateOfferFormPage"><fmt:message key="menu.createOffer"/></a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/offers/showAllOffersPage"><fmt:message key="menu.listOffer"/></a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>            
        </ul>
        <!-- /#side-menu -->
    </div>
    <!-- /.sidebar-collapse -->
</div>