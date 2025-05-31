db = db.getSiblingDB('product-service');

db.createUser({
  user: "appuser",
  pwd: "apppassword",
  roles: [{ role: "readWrite", db: "product-service" }]
});
