import PropTypes from 'prop-types'

const Button = ({buttonContent}) => {
  return (
    <>
      <button className="btn btn-outline-primary btn-md">{buttonContent}</button>
    </>
  )
}

Button.defaultProps = {
  buttonContent: 'Add',
}

Button.propTypes = {
  buttonContent: PropTypes.string.isRequired,
}

export default Button