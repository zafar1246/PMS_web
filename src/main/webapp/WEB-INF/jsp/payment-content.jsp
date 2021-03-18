
	<div class="card-header col fas fa-credit-card aa6122">
           				<button type="button" class="close aa6122" data-dismiss="modal">×</button>
          				<b>PAYMENTS</b>
        			</div>
         
          <div class="card-body">
            
           	<div class="row">
              <div class="col-2.5" >
                <div class="nav flex-column nav-tabs form-label" id="vert-tabs-tab" role="tablist" aria-orientation="vertical">
                  <a class="nav-link active" style=color:#aa6122; id="vert-tabs-upi-tab" data-toggle="pill" href="#vert-tabs-upi" role="tab" aria-controls="vert-tabs-upi" aria-selected="true">UPI</a>
                  <a class="nav-link " style=color:#aa6122; id="vert-tabs-cards-tab" data-toggle="pill" href="#vert-tabs-cards" role="tab" aria-controls="vert-tabs-cards" aria-selected="false">Credit/Debit Card</a>
                  <a class="nav-link" style=color:#aa6122; id="vert-tabs-banking-tab" data-toggle="pill" href="#vert-tabs-banking" role="tab" aria-controls="vert-tabs-banking" aria-selected="false">Net Banking</a>
         		</div>
              </div>
              
              	<div class="col-3 col-sm-9">
                	<div class="tab-content" id="vert-tabs-tabContent">
                  <div class="tab-pane fade show active" id="vert-tabs-upi" role="tabpanel" aria-labelledby="vert-tabs-upi-tab">
                      		<div class="row mt-4 ml-5">
                    			<div class="col-3 ">
                         			<input class="form-check-input" type="radio" value="1" id="upiPayRadioBtn" name="gender" checked="">
                         			<label class="form-check-label">Your UPI ID</label>
        						</div>
        						<div class="col-3">
                          			<input class="form-check-input" type="radio" value="2" id="googlePayRadioBtn" name="gender">
                         			<label class="form-check-label">Google Pay</label>
                         		</div>
                         		<div class="col-3">
                          			<input class="form-check-input" type="radio" value="3" id="stcPayRadioBtn" name="gender">
                         			<label class="form-check-label">STC Pay</label>
                         		</div>
                         	</div>
                         		<div class="mt-5 ml-3"align="left">
                         			<button type="submit"  class=" col-2 btn aa6122" >Pay</button>
                       			 </div>
                  </div>
                  <div class="tab-pane fade" id="vert-tabs-cards" role="tabpanel" aria-labelledby="vert-tabs-cards-tab">
                     <div class="row ml-3">
								<label for="fname">Accepted Cards</label>
										
            							<div class="icon-container ml-3">
             							 	<i class="fab fa-cc-visa ml-1" style="color:navy;"></i>
             							 	<i class="fab fa-cc-amex ml-1" style="color:blue;"></i>
              							 	<i class="fab fa-cc-mastercard ml-1" style="color:red;"></i>
             							 	<i class="fab fa-cc-discover ml-1" style="color:orange;"></i>
           								</div>
										</div>
										<div class="row ml-2"> 
											<div class="form-group col-3">
												<label for="cname">Name on Card</label>
												<input type="text" class="form-control" placeholder="Name on Card"><br>
												<label for="cname">Exp Month</label>
												<select class="form-control" id="ddlMonths"></select>
											</div>
                             				<div class="form-group  col-3">
                     							<label for="cname">Card Number</label>
												<input type="text" class="form-control" placeholder="Card Number ..."><br>
												<label for="cname">Exp Year</label>
												<select class="form-control" id="ddlYears"></select>
											</div>
                     						<div class="form-group col-2">
               									<label for="cvv">CVV</label>
               									<input type="text"class="form-control" id="cvv" name="cvv" placeholder="352"><br>
               									
               									<label for="paymentButton">Payment</label>
                         						<button type="submit" class="btn btn-block aa6122">Pay</button>
                       						</div>
								</div>
                  </div>
                  <div class="tab-pane fade" id="vert-tabs-banking" role="tabpanel" aria-labelledby="vert-tabs-banking-tab">
                     		<div>
								<label>Popular Banks</label>
								<div class="row ml-2">
										<div class="col-4.5 ml-4">
											
                         						<input class="form-check-input" type="radio" value="1" id="bank1" name="gender"  alt="Home" title="Home" checked="">
                         						<label class="form-check-label">National Commercial Bank</label><br>
                         						<input class="form-check-input" type="radio" value="2" id="bank2" name="gender">
                         						<label class="form-check-label">Saudi British Bank</label><br>
                         						<input class="form-check-input" type="radio" value="3" id="bank3" name="gender">
                         						<label class="form-check-label">Alinma Bank</label>
                         				</div>
                         				<div class="col-4.5 ml-4">
                         						<input class="form-check-input" type="radio" value="4" id="bank4" name="gender">
                         						<label class="form-check-label">Banque Saudi Fransi</label><br>
                         						<input class="form-check-input" type="radio" value="5" id="bank5" name="gender">
                         						<label class="form-check-label">Riyad Bank</label><br>
                         						<input class="form-check-input" type="radio" value="6" id="bank6" name="gender">
                         						<label class="form-check-label">The Saudi American Bank</label>
                         					</div>
                         		</div>
                       		</div>		
                         				<div class="row ml-1">
                         						<div class="col-6">
                        							<label class="col-form-label">Other Banks</label>
                       								<select class="form-control">                         								
                          								 <option value="7">The Saudi Hollandi Bank (Alawwal Bank) (SHB)</option>
                          								 <option value="8">The Al Rajhi Bank</option>
                          								 <option value="9">Arab National Bank (ANB)</option>
                          								 <option value="10">Al Bilad Bank</option>
                          								 <option value="11">Bank AlJazira</option>
                          								 <option value="12">Islamic Development Bank</option> 	
                          							</select>
                      							</div>
                      							<div class="col-2 mt-1">
                      								<label for="paymentButton">Payment</label>
                         							<button type="submit" class="btn btn-block aa6122">Pay</button>
                         						</div>
                         			</div>
                 				</div>
               				</div>
              			</div>
            		</div>     
      			</div>        
					
					<div class="col" align="right">
            			<button type="button" class="col-2 mb-2 btn btn-dark" data-dismiss="modal">Close</button>
          			</div>






