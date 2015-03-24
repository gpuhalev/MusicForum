<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Index</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/myStyle.css" rel="stylesheet">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>	
    <script src="js/myScript.js"></script>

</head>

<body>

        <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li id="startBttn">
                        <a>START</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!-- Page Content -->
    <div class="container">

        <div class="row">
        	<div class="pages"  id="page1">
		            <table class="table borderless">
		            	<tr>
		            		<td class="col-md-3">
					            <h2>User Registration</h2>
								<form role="form" id="userform">
									<div class="form-group">
										<label for="userName">Username</label>
										<input type="text" id="userName" class="form-control" placeholder="Enter username">
									</div>
									<div class="form-group">
										<label for="email">E-mail</label>
										<input type="email" id="email" class="form-control" placeholder="Enter email">
									</div>
									<div class="form-group">
										<label for="password">Password</label>
										<input type="password" id="password" class="form-control" placeholder="Enter password">
									</div>
									<label>Sex:</label>
									<div class="radio">
										<label><input type="radio" name="sexradio">Male</label>
									</div>
									<div class="radio">
										<label><input type="radio" name="sexradio">Female</label>
									</div>
									<div class="radio">
										<label><input type="radio" name="sexradio" checked="checked">I'd rather not tell</label>
									</div>
									<button type="submit" class="btn btn-default">Submit</button>
								</form>
							</td>

							<td class="col-md-1">
							</td>

							<td class="col-md-3">
					            <h2>Add Ad</h2>
								<form role="form" id="adform">
									<div class="form-group">
										<label for="userName">Username</label>
										<input type="text" id="userName" class="form-control" placeholder="Enter your username">
									</div>
									<div class="form-group">
										<label for="city">City</label>
										<input type="text" id="city" class="form-control" placeholder="Enter your city">
									</div>
									<label>I am:</label>
									<div class="radio">
										<label><input type="radio" name="isradio">A musician looking for a band</label>
									</div>
									<div class="radio">
										<label><input type="radio" name="isradio">A band looking for a musician</label>
									</div>
									<div class="form-group">
										<label for="password">Choose your instrument</label>
										<select class="form-control" id="instrumentSelect">
											<option value=""></option>
										</select>
									</div>
									<button type="submit" class="btn btn-default">Submit</button>
								</form>
							</td>
						</tr>
						<tr>
							<td class="col-md-3">
								<h2>Add an instrument</h2>
								<form role="form" id="instrumentform">
									<div class="form-group">
										<label for="userName">Username</label>
										<input type="text" id="userName" class="form-control" placeholder="Enter your username">
									</div>
									<div class="form-group">
										<label for="instrument">Instrument</label>
										<input type="text" id="instrument" class="form-control" placeholder="Enter the instrument you want to add">
									</div>
									<button type="submit" class="btn btn-default">Submit</button>
								</form>
							</td>

							<td class="col-md-1">
							</td>
							<td class="col-md-3">
							</td>
						</tr>
					</table>
			</div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap-filestyle.min.js"></script>

</body>

</html>
